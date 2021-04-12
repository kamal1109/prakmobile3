package com.example.recycleview;

import java.util.ArrayList;

public class TokoData {
    private static String[] title = new String[]{"tokopedia","zalora","alibaba","bukalapak","shopee","lazada","olx","blibli","aliexpress","jdid"};

    private static int[] thumbnail = new
            int[]{R.drawable.tokopedia,R.drawable.zalora,
            R.drawable.alibaba,R.drawable.bukalapak,R.drawable.shopee,R.drawable.lazada,
            R.drawable.olx,R.drawable.blibli,R.drawable.aliexpress,R.drawable.jdid};

    private static String[] preview = new String[]{
            "merupakan perusahaan perdagangan elektronik atau sering disebut toko daring. Sejak didirikan pada tahun 2009, Tokopedia telah bertransformasi menjadi sebuah unicorn yang berpengaruh tidak hanya di Indonesia tetapi juga di Asia Tenggara",
            "ZALORA adalah toko online fashion dan kecantikan yang menawarkan koleksi pakaian, aksesoris, sepatu dan produk kecantikan untuk pria dan wanita. Berpusat di Singapura, ZALORA juga terdapat di Hong Kong, Singapura, Indonesia, Filipina, Thailand, Vietnam, Malaysia dan Brunei.",
            "Alibaba Group Holding Limited, also known as Alibaba Group and Alibaba.com, is a Chinese multinational technology company specializing in e-commerce, retail, Internet, and technology.",
            "Bukalapak merupakan salah satu perusahaan e-commerce di Indonesia. Didirikan oleh Achmad Zaky, Nugroho Herucahyono, dan Muhamad Fajrin Rasyid pada tahun 2010. Bukalapak awalnya merupakan toko daring yang memungkinkan para pelaku Usaha Kecil dan Menengah untuk merambah ke dunia maya.",
            "Shopee adalah situs elektronik komersial yang berkantor pusat di Singapura di bawah naungan SEA Group, yang didirikan pada 2009 oleh Forrest Li. Shopee pertama kali diluncurkan di Singapura pada tahun 2015, dan sejak itu memperluas jangkauannya ke Malaysia, Thailand, Taiwan, Indonesia, Vietnam, dan Filipina.",
            "Lazada Group adalah sebuah perusahaan e-commerce Asia Tenggara yang didirikan oleh Rocket Internet dan Pierre Poignant pada 2012, dan dimiliki oleh Alibaba Group.",
            "OLX Group adalah pasar daring global yang berkantor pusat di Amsterdam, dan dimiliki oleh kelompok media dan teknologi di Afrika Selatan, Naspers. Perusahaan ini didirikan pada 2006 dan beroperasi di 45 negara.",
            "Blibli.com adalah salah satu situs web perdagangan elektronik di Indonesia. Blibli adalah produk pertama PT Global Digital Niaga yang merupakan anak perusahaan Djarum di bidang digital yang didirikan pada tahun 2010.",
            "AliExpress is an online retail service based in China owned by the Alibaba Group. Launched in 2010, it is made up of small businesses in China and other locations, such as Singapore, that offer products to international online buyers."
            ,"JD.com, Inc., also known as Jingdong and formerly called 360buy, is a Chinese e-commerce company headquartered in Beijing. It is one of the two massive B2C online retailers in China by transaction volume and revenue, a member of the Fortune Global 500 and a major competitor to Alibaba-run Tmall."
    };

    public static ArrayList<Toko_Gaya> getListData(){
        Toko_Gaya tokoGaya = null;
        ArrayList<Toko_Gaya> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            tokoGaya = new Toko_Gaya();
            tokoGaya.setLambangtoko(thumbnail[i]);
            tokoGaya.setNamatoko(title[i]);
            tokoGaya.setPrivew(preview[i]);
            list.add(tokoGaya);
        }
        return list;
    }
}
