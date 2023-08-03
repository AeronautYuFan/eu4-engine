public class Unit {
    private int tech;
    private double[][] baseDamageTable; //[damage type (0 = fire, 1 = shock)][tech level]
    private double[][] realDamageTable; //[damage type (0 = fire, 1 = shock)][tech level]
    private double combatAbility;
    private double fAdd;
    private double fMult;
    private double fReduction;
    private double sAdd;
    private double sMult;
    private double sReduction;

    public Unit() {
        combatAbility = 1;
        fAdd = 0;
        fMult = 1;
        fReduction = 1;
        sAdd = 0;
        sMult = 1;
        sReduction = 1;
    }

    public Unit(double ca, double f, double fm, double fr, double s, double sm, double sr) {
        combatAbility = ca;
        fAdd = f;
        fMult = fm;
        fReduction = fr;
        sAdd = s;
        sMult = sm;
        sReduction = sr;
    }
//================================GETTERS
    public double getCombatAbility() {
        return combatAbility;
    }
    public double getFireDmgAdd() {
        return fAdd;
    }
    public double getFireDmgMult() {
        return fMult;
    }
    public double getFireDmgReceived() {
        return fReduction;
    }
    public double getShockDmgAdd() {
        return sAdd;
    }
    public double getShockDmgMult() {
        return sMult;
    }
    public double getShockDmgReceived() {
        return sReduction;
    }
//====================================SETTERS
    public void setCombatAbility(double x) {
        combatAbility = x;
    }
    public void setFireDmgAdd(double x) {
        fAdd = x;
    }
    public void setFireDmgMult(double x) {
        fMult = x;
    }
    public void setFireDmgReceived(double x) {
        fReduction = x;
    }
    public void setShockDmgAdd(double x) {
        sAdd = x;
    }
    public void setShockDmgMult(double x) {
        sMult = x;
    }
    public void setShockDmgReceived(double x) {
        sReduction = x;
    }

}