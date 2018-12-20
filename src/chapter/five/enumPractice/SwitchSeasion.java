package chapter.five.enumPractice;

/**
 * @author 江峰
 * @create 2018-12-18 13:30
 */
public class SwitchSeasion {
    private Season season;

    SwitchSeasion(Season season) {
        this.season = season;
    }

    void describeSeason() {
        switch (season) {
            case SPRING:
                System.out.println("百花争艳");
                break;
            case SUMMER:
                System.out.println("巨热无比");
                break;
            case AUTUMN:
                System.out.println("一叶知秋");
                break;
            case WINTER:
                System.out.println("大雪纷飞");
                break;
        }
    }

    public static void main(String[] args) {
        SwitchSeasion switchSeasion = new SwitchSeasion(Season.WINTER);
        switchSeasion.describeSeason();
    }
}
