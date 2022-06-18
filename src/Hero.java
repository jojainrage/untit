public class Hero {
    public Hero(int heroHealth, int heroDamage, String heroAtackType) {
        HeroHealth = heroHealth;
        HeroDamage = heroDamage;
        HeroAtackType = heroAtackType;
    }

    public Hero(int heroHealth, int heroDamage) {
        HeroHealth = heroHealth;
        HeroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public String getHeroAtackType() {
        return HeroAtackType;
    }

    public void setHeroAtackType(String heroAtackType) {
        HeroAtackType = heroAtackType;
    }

    private int HeroHealth ;
    private int HeroDamage;
    private String HeroAtackType;
}
