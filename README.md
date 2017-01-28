A project to reproduce [bug 511252](https://bugs.eclipse.org/bugs/show_bug.cgi?id=511252) in the Eclipse compiler.

`mvn compile` works. However, the Eclipse compiler throws the following error:

>Type mismatch: cannot convert from CompletionStage&lt;Object&gt; to CompletionStage&lt;Optional&lt;T&gt;&gt;
/eclipsebugs/src/main/java/com/benmccann/bugs/eclipse/compiler/ConfigurationServiceLocator.java	line 16
