package com.benmccann.bugs.eclipse.compiler;

public class JavaAuctionEntity extends JavaPersistentEntity<AuctionCommand, AuctionEvent, AuctionState> {

  private JavaPersist<AuctionEvent> persistAndDone() {
    return null;
  }

}
