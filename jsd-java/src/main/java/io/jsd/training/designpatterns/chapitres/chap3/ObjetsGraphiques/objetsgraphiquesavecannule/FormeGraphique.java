﻿package io.jsd.training.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiquesavecannule;public class FormeGraphique {    protected int xpos;    protected int ypos;     public static final int YMAX = 100;    public FormeGraphique(int x, int y) {        this.xpos = x;        this.ypos = y;    }    public int getX() {        return xpos;    }    public void setX(int x) {        this.xpos = x;    }    public int getY() {        return ypos;    }    public void setY(int y) {        this.ypos = y;    }}