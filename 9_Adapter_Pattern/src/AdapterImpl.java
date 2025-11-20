public class AdapterImpl implements AdapterInterface{
    AdapteeInterface obj;

    public AdapterImpl(AdapteeInterface obj){
        this.obj=obj;
    }

    @Override
    public double ConvertWeight() {
        int weightInPounds=obj.returnWeightinPounds();
        return weightInPounds*0.45;

    }
}
