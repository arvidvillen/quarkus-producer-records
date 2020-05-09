package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ExampleRecordProducer
{
  @Produces
  @RequestScoped
  public ExampleRecord produceExampleRecord()
  {
    return new ExampleRecord("test");
  }
}
