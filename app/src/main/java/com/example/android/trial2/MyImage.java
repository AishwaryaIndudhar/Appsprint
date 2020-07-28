package com.example.android.trial2;

public class MyImage {
    private int imgid1;
    private int imgid2;
    private int imgid3;

    public int getimgid1(){
        return imgid1;
    }

    public int getimgid2(){
        return imgid2;
    }

    public int getimgid3(){
        return imgid3;
    }


    public MyImage(int img1,int img2,int img3){
        imgid1=img1;
        imgid2=img2;
        imgid3=img3;
    }
}
