package me.will.IndexRecyclerView;

public class ItemModel implements Comparable<ItemModel>{
    String name;
    String url;
    int resourceId;

    public ItemModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public ItemModel(String name, int resourceId) {
        this.name = name;
        this.resourceId = resourceId;
    }

    @Override
    public int compareTo(ItemModel another) {
        return HanziToPinyin.getFirstPinYinChar(name).compareTo(HanziToPinyin.getFirstPinYinChar(another.name));
    }
}
