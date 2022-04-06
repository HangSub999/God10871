package FastCampus;

public class BirthDay {
    private int day;
    private int month;
    private String year;

    private boolean isValid;

    public int gteDay() {
        return day;
    }

    public void setDay(int day) {

        switch (month) {
            case 1:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 2:
                if (day <= 28) {
                    isValid = true;
                } else isValid = false;
                break;
            case 3:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 4:
                if (day <= 30) {
                    isValid = true;
                } else isValid = false;
                break;
            case 5:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 6:
                if (day <= 30) {
                    isValid = true;
                } else isValid = false;
                break;
            case 7:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 8:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 9:
                if (day <= 30) {
                    isValid = true;
                } else isValid = false;
                break;
            case 10:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
            case 11:
                if (day <= 30) {
                    isValid = true;
                } else isValid = false;
                break;
            case 12:
                if (day <= 31) {
                    isValid = true;
                } else isValid = false;
                break;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year.length() > 4) {
            isValid = false;
        } else {
            isValid = true;
            this.year = year;
        }
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        } else {
            System.out.println("우효하지 않는 날짜 입니다.");
        }
    }
}
