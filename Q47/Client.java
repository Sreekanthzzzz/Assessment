package com.springboot.demo.mycoolapp;

abstract class Window
{
    public abstract void set();
    public abstract void get();
}



class PMWindow extends Window
{


@Override
public void set() {
	System.out.println("PMWindow:set()");
	
}



@Override
public void get() {
	System.out.println("PMWindow:get()");
	
}
    
}



class MotifWindow extends Window
{






@Override
public void set() {
	System.out.println("MotifWindow:set()");
	
}



@Override
public void get() {
	System.out.println("MotifWindow:get()");
	
}
}



abstract class ScrollBar
{
    public abstract void scrollup();
    public abstract void scrolldown();
}



class PMScrollBar extends ScrollBar
{
@Override
public void scrollup() {
	System.out.println("PMScrollBar:scrollup()");
	
}



@Override
public void scrolldown() {
	System.out.println("PMScrollBar:scrolldown()");
	
}
}



class MotifScrollBar extends ScrollBar
{



@Override
public void scrollup() {
	System.out.println("MotifScrollBar:scrollup()");
	
}



@Override
public void scrolldown() {
	System.out.println("MotifScrollBar:scrollup()");
	
}
}



abstract class WidgetFactory
{
    abstract Window createWindow();
    abstract ScrollBar createScrollBar();
}



class PMWidgetFactory extends WidgetFactory
{
    Window createWindow()
    {
        return new PMWindow();
    }
    ScrollBar createScrollBar()
    {
        return new PMScrollBar();
    }
}



class MotifWidgetFactory extends WidgetFactory
{
    Window createWindow()
    {
        return new MotifWindow();
    }
    ScrollBar createScrollBar()
    {
        return new MotifScrollBar();
    }
}



class FactoryMaker
{
    private static WidgetFactory obj=null;
    static WidgetFactory getFactory(String choice)
    {
        if(choice.equals("PMWidgetFactory"))
        {
            obj=new PMWidgetFactory();
        }
        else if(choice.equals("MotifWidgetFactory"))
        {
            obj=new MotifWidgetFactory();
        }
        return obj;
    }
}



public class Client
{
    public static void main(String args[])
    {
        WidgetFactory factory1 = FactoryMaker.getFactory("PMWidgetFactory");
        Window window1 = factory1.createWindow();
        window1.set();
        window1.get();

        WidgetFactory  factory2= FactoryMaker.getFactory("MotifWidgetFactory");
        Window window2 = factory2.createWindow();
        window2.set();
        window2.get();
    }
}