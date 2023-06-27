package com.sunday;//wireless chk

interface NonWireless {
    void Fridge();
    void phone();
}

class ElectricalMain implements NonWireless {
    @Override
    public void Fridge() {
        System.out.println("Using a non-wireless fridge.");
    }

    @Override
    public void phone() {
        System.out.println("Using a non-wireless phone.");
    }

    public static void main(String[] args) {
        ElectricalMain e = new ElectricalMain();
        e.Fridge();
        e.phone();
    }
}
