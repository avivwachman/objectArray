package Targil1;
//    :) Happily by Aviv Wachman YA2

public class Channel {
    //  -------תכונות-------
    private String name;
    private int num;
    private String type;

    //-------פעולה בונה------
    public Channel(String name, int num, int type) {
        this.name = name;
        this.num = num;
        this.type="ספורט";       //ברירת מחדל למקרה שהמספר שהתקבל אינו מתאים

        //---------השתמשתי במשפטי switch אשר עוד לא נלמדו--------------
        //שיטה זו מאוד יעילה להוספת הערוצים בתור מחרוזת על פי מספר
        switch (type){//המספר שהוזן
            case 0://אם הוזן אפס
                this.type = "ספורט";//ערוץ מסוג ספורט
                break;//אין טעם להמשיך לבדוק ערוצים נוספים
            case 1:
                this.type ="פעולה";
                break;
            case 2:
                this.type="משפחה";
                break;
            case 3:
                this.type="סרטים";
                break;
            case 4:
                this.type="ילדים";
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", type=" + type +
                '}';
    }
}
