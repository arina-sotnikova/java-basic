package ru.otus.home.homework4;

public class Box {
    private final int size;
    private final String color;
    private boolean isOpen;
    private Item item;

    public Box(int size, String color, boolean isOpen, Item item) {
        this.size = size;
        this.color = color;
        this.isOpen = isOpen;
        this.item = item;
    }

    public void open() {
        if (!isOpen)
            this.isOpen = true;
        else
            System.out.println("The box is already open");
    }

    public void close() {
        if (isOpen)
            this.isOpen = false;
        else
            System.out.println("The box is already closed");
    }

    public void addItem(Item item) {
        if (isOpen && this.item == null) {
            System.out.println("Adding " + item.getName() + " to the box");
            this.item = item;
        } else if (!isOpen) {
            throw new IllegalStateException("The box is closed");
        } else {
            throw new IllegalStateException("The box is already full");
        }
    }

    public void extractItem() {
        if (isOpen && this.item != null) {
            System.out.println("Extracting " + item.getName() + " from the box");
            this.item = null;
        } else if (!isOpen) {
            throw new IllegalStateException("The box is closed");
        } else {
            throw new IllegalStateException("Nothing to extract");
        }
    }

    public void getBoxInfo() {
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("The box is open: " + isOpen);
        if (this.item != null) {
            System.out.println("The box contains: " + item.getName());
        } else
            System.out.println("The box is empty");
        }
}
