
	package com.betteryanwo.controller;

    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class UserRegister {


        /**
         * 判断字符串只有字母和数字且长度是3-15;
         *
         * @param str
         * @return
         */
        public Boolean isLetterDigit(String str) {

            String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{3,15}$";
             return str.matches(regex);
        }

        /**
         * 字符串长度的验证
         *
         * @param s
         * @return
         */
        public int getlen(String s) {

            int x=s.length();
            return x;

        }
        /**
         * 电子邮箱格式的验证
         *
         * @param s
         * @return
         */
        public Boolean getEmail(String s) {
            Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
             Matcher m = p.matcher(s);
            //Mather m = p.matcher("wangxu198709@gmail.com.cn");这种也是可以的！
             boolean b = m.matches();
             return b;
        }
         /**
         * 手机号验证
         *
         * @param str
         * @return 验证通过返回true
         */
        public Boolean isMobile(String str) {
            Pattern p = null;
            Matcher m = null;
            boolean b = false;
            p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
            m = p.matcher(str);
            b = m.matches();
            return b;
        }
    }

