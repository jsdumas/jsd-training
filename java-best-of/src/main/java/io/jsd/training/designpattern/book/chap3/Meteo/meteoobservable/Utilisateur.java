﻿package io.jsd.training.designpattern.book.chap3.Meteo.meteoobservable;public class Utilisateur {    public static void main(String[] args) {        DonneesMeteo donneesMeteo = new DonneesMeteo();        donneesMeteo.setTemperature(24.00);        donneesMeteo.setVitesseVent(10.00);        donneesMeteo.setTauxHumidite(8.20);        WidgetMeteo widgetMeteo = new WidgetMeteo();        PluginMeteo pluginMeteo = new PluginMeteo();        donneesMeteo.addObserver(widgetMeteo);        donneesMeteo.addObserver(pluginMeteo);        donneesMeteo.setTemperature(25.00);        donneesMeteo.setTauxHumidite(7.00);    }}