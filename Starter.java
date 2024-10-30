package com.gildedrose;

public class Starter {
    public static void main(String[] args) {
        // Creazione di vari oggetti Item per testare i vari casi
        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Conjured Mana Cake", 5, 30),
                new Item("Standard Item", 3, 6)
        };

        // Creazione dell'istanza GildedRose
        GildedRose gildedRose = new GildedRose(items);

        // Simulazione di 20 giorni di aggiornamenti
        for (int day = 1; day < 21; day++) {
            System.out.println("-------- Day " + day + " --------");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();

            // Aggiornamento della qualità degli item
            gildedRose.updateQuality();
        }
    }
}
