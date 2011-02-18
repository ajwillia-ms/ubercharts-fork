package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;

/**
 * Date: Feb 18, 2011
 * Time: 6:06:55 PM
 *
 * @author Mohammed El Batya
 */
abstract public class AbstractSeries<DataType, ImplementationType extends AbstractSeries> implements ISeries<DataType, ImplementationType> {

  private DataType data;
  private String name = "";
  private String stack = "";
  private Type type = Type.line;
  private Integer xAxis = 0;
  private Integer yAxis = 0;


  public AbstractSeries(String pName) {
    name = pName;
  }

  public String getName() {
    return name;
  }

  public ImplementationType setName(String pName) {
    name = pName;
    return (ImplementationType) this;
  }

  public String getStack() {
    return stack;
  }

  public ImplementationType setStack(String pStack) {
    stack = pStack;
    return (ImplementationType) this;
  }

  public Type getType() {
    return type;
  }

  public ImplementationType setType(Type pType) {
    type = pType;
    return (ImplementationType) this;
  }

  public Integer getxAxis() {
    return xAxis;
  }

  public ImplementationType setxAxis(Integer pXAxis) {
    xAxis = pXAxis;
    return (ImplementationType) this;
  }

  public Integer getyAxis() {
    return yAxis;
  }

  public ImplementationType setyAxis(Integer pYAxis) {
    yAxis = pYAxis;
    return (ImplementationType) this;
  }

  public DataType getData() {
    return data;
  }

  public ImplementationType setData(DataType pData) {
    data = pData;
    return (ImplementationType) this;
  }
}
