package it.unisa.railways;

import java.util.List;

public class ExpressTrain {
    private final TrainStop partenza; //departures Station
    private  final TrainStop arrivo; //arrival Station
    private final List<TrainStop> fermate; //fermate intermedie
    private final int postiDisp;
    private final double kmTot;
    private  final int postiRistoro;

    public ExpressTrain(TrainStop partenza, TrainStop arrivo, List<TrainStop> fermate, int postiDisp, int postiRistoro,double kmTot){ //costruttore da fare vedi il test
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.fermate = fermate;
        this.postiDisp = postiDisp;
        this.postiRistoro = postiRistoro;
        this.kmTot = kmTot;
    }

    public int getPosti(){ //posti disponibili
        return postiDisp;
    }

    public TrainStop getPartenza(){
        return partenza;
    }

    public TrainStop getArrivo(){
        return arrivo;
    }

    public double getKmTot(){
        return kmTot;
    }

    public List<TrainStop> getIntermediateStops(){
        return fermate;
    }

    public int getTotalNumberOfStops(){
        return this.fermate.size() + 2;
    }

    public double computeMaxRevenues(double costoKmPersona, double costoKmRistoro){
        double ricavoPerKm = costoKmPersona * this.getPosti() * this.getKmTot() ;
        double ricavoRistoro = costoKmRistoro * this.postiRistoro * this.getKmTot() ;
        return ricavoPerKm + ricavoRistoro;
    }



}
