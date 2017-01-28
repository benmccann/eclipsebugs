package com.benmccann.bugs.eclipse.compiler;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

public class ConfigurationServiceLocator {

  private final Map<String, URI> services = new HashMap<>();

  public <T> CompletionStage<Optional<T>> doWithService(String name, Function<URI, CompletionStage<T>> block) {
      return Optional.ofNullable(services.get(name))
              .map(block.andThen(cs -> cs.thenApply(Optional::ofNullable)))
              .orElse(CompletableFuture.completedFuture(Optional.empty()));
  }

}
