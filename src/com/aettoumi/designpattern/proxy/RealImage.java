package com.aettoumi.designpattern.proxy;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
public class RealImage implements Image {


  private String fileName;
  private double size;

  public RealImage(final String fileName) {
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  @Override
  public void displayImage() {
    System.out.println("Displaying " + fileName);
  }

  private void loadFromDisk(String fileName) {
    this.size = Math.random() * 100;
    System.out.println(String.format("Loading %s having size %s MO", fileName, size));
  }
}
