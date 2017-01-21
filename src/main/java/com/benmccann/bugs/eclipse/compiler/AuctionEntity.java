package com.benmccann.bugs.eclipse.compiler;

import java.util.Optional;

import com.lightbend.lagom.javadsl.persistence.PersistentEntity;

import akka.Done;

public class AuctionEntity extends PersistentEntity<AuctionCommand, AuctionEvent, AuctionState> {

  private Persist<AuctionEvent> persistAndDone() {
    return null;
  }

  @Override
  public PersistentEntity<AuctionCommand, AuctionEvent, AuctionState>.Behavior initialBehavior(
      Optional<AuctionState> arg0) {
    // TODO Auto-generated method stub
    return null;
  }

}
