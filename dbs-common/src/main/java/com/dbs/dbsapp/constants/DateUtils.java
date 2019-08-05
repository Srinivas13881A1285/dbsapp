package com.dbs.dbsapp.constants;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DateUtils {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    public static void main(String[] args) {

        //String fname = getExtensionByStringHandling("Abc.xls");
        //System.out.println(fname);
        //System.out.println(formatDate("3/26/2019"));
        //System.out.println(formatDate("2019-03-26"));
        //System.out.println(getDate("3/26/2019"));
    }

    public static String getExtensionByStringHandling(String filename) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String dateTime = simpleDateFormat.format(timestamp);

        Optional<String> optFilename = Optional.ofNullable(filename).filter(f -> f.contains(".")).map(f -> f.substring(0, filename.lastIndexOf(".")));

        Optional<String> exten = Optional.ofNullable(filename).filter(f -> f.contains(".")).map(f -> f.substring(filename.lastIndexOf(".") + 1));

        StringBuffer sb = new StringBuffer();
        sb.append(optFilename.get());
        sb.append("_");
        sb.append(dateTime);
        sb.append(".");
        sb.append(exten.get());

        return sb.toString();
    }

    public static LocalDate getDate(final String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
}
