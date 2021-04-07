package ru.ekhlusov.models;

/**
 * @author Evgeniy Khlusov
 * 07.04.2021
 */
public class Person {
	private String name;
	private String surname;
	private String phone;

	public Person(String name, String surname, String phone) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
