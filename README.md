A project to reproduce a Eclipse compiler bug that was originally identified in [lagom/online-auction-java](https://github.com/lagom/online-auction-java).

`mvn compile` works. However, the Eclipse compiler throws the following error:

>Bound mismatch: The type AuctionEvent is not a valid substitute for the bounded parameter &lt;B extends Event&gt; of the type PersistentEntity&lt;Command,Event,State&gt;.Persist&lt;B&gt;
/lagomtypebug/src/main/java/com/benmccann/bugs/eclipse/compiler.AuctionEntity.java	line 11
