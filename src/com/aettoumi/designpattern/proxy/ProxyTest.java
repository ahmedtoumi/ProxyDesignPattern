package com.aettoumi.designpattern.proxy;

public class ProxyTest {

  public static void main(String[] args) {
    Image image = new ProxyImage("test_image_with_proxy.jpg");

    /*
     * image will be loaded from disk
     */
    System.out.println("---------------First Call------------");
    image.displayImage();
    System.out.println("---------------------------");
    System.out.println("--------------Second Call-------------");

    /*
     * image will not be loaded from disk
     */
    image.displayImage();

  }

}
