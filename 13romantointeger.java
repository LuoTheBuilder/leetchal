class Solution {
    public int romanToInt(String s) {


            int count = 0;
        int num = 0;
        int prevnum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            count += num;
            if (num > prevnum){
                count-=2*prevnum;
            }
            prevnum=num;

        }return count;
    }


    }
