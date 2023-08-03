public class Infantry extends Unit {
    private int tech;
    private final double[][] baseDamageTable = {
            {0.25,0.35,0.35,0.35,0.35,0.35,0.55,0.55,0.8,0.8,0.8,0.8,0.8,0.8,1.1,1.1,1.1,1.1,1.1,1.1,1.6,1.6,1.6,1.6,1.6,1.6,1.6,2.1,2.1,2.1,2.1,3.2,3.2},
            {0.2,0.3,0.5,0.5,0.5,0.65,0.95,0.95,0.95,0.95,0.95,1.15,1.15,1.15,1.15,1.15,1.15,1.15,1.15,1.15,1.15,1.65,1.65,1.65,1.65,1.65,1.65,1.65,2.15,2.15,2.15,2.15,2.15}
    }; //[damage type (0 = fire, 1 = shock)][tech level]
    private double[][] realDamageTable;

    public Infantry(double ca, double f, double fm, double fr, double s, double sm, double sr) {
        super(ca, f, fm, fr, s, sm, sr);
        realDamageTable = baseDamageTable;
    }

    public double getFireDamage(int tech) { return realDamageTable[0][tech - 1]; }
    public double getShockDamage(int tech) { return realDamageTable[1][tech - 1]; }

    public void updateFireDamageTable() {
        for(int i = 0; i < realDamageTable[0].length; i++) {
            double temp = realDamageTable[0][i];
            realDamageTable[0][i] = ((temp + getFireDmgAdd()) * getFireDmgMult());
        }
    }


    //public Infantry(double fAdd, double shock, double combat) {

    //}

    public void refreshDamageTable() {
        realDamageTable = baseDamageTable;
    }
}