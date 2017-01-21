A project to reproduce [bug 510807 in the Eclipse compiler](https://bugs.eclipse.org/bugs/show_bug.cgi?id=510807). This issue was originally identified in [lagom/online-auction-java](https://github.com/lagom/online-auction-java).

`mvn compile` works. However, the Eclipse compiler throws the following error:

>Bound mismatch: The type AuctionEvent is not a valid substitute for the bounded parameter &lt;B extends Event&gt; of the type PersistentEntity&lt;Command,Event,State&gt;.Persist&lt;B&gt;
/lagomtypebug/src/main/java/com/benmccann/bugs/eclipse/compiler/AuctionEntity.java	line 11

These types are defined in two Java classes in this project:

- `public class AuctionEntity extends PersistentEntity<AuctionCommand, AuctionEvent, AuctionState> {`
- `public interface AuctionEvent extends AggregateEvent<AuctionEvent> {`

And two classes which define and use the type parameter `Event` in the Scala Lagom project:

- [`abstract class PersistentEntity[Command, Event, State] {`](https://github.com/lagom/lagom/blob/1.2.x/persistence/src/main/scala/com/lightbend/lagom/javadsl/persistence/PersistentEntity.scala#L113)
- [`trait Persist[B <: Event]`](https://github.com/lagom/lagom/blob/1.2.x/persistence/src/main/scala/com/lightbend/lagom/javadsl/persistence/PersistentEntity.scala#L390)

While this code is defined in Scala, it gets compiled to Java class files and is consumable from any Java project.
