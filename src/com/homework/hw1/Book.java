package com.homework.hw1;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    public static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public String toString() {
            return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
        }
    }

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ",authors=" + Arrays.toString(getAuthors()) + ",price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Author author : authors) {
            stringBuilder.append(author.name).append(",");
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), ".");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0 && getQty() == book.getQty() && getName().equals(book.getName()) && Arrays.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice(), getQty());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }
}
