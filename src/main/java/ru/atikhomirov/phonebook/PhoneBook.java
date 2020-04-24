package ru.atikhomirov.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> records = new HashMap<String, String>();

    public void add(String phone, String name) {
        records.put(phone, name);
    }

    public String[] getPhones(String name) {
        List<String> result = new ArrayList<>();
        for (Map.Entry entry : records.entrySet()) {
            if (name.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    public String searchPhones(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("Поиск по фамилии \"" + name + "\":\n");
        for (String result:getPhones(name)) {
            sb.append(result + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : records.entrySet()) {
            sb.append(entry.getValue() + "\t- " + entry.getKey() + "\n");
        }
        return sb.toString();
    }
}
