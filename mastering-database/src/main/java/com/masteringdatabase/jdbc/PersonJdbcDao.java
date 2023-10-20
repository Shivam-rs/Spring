package com.masteringdatabase.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.masteringdatabase.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	class PersonRowMapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();

			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			return person;
		}

	}

	public List<Person> findAll() {

		return jdbcTemplate.query("select * from person", new PersonRowMapper());

	}

	@SuppressWarnings("deprecation")
	public Person findById(int id) {

		return jdbcTemplate.queryForObject("select * from person where id =?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));

	}

	public List<Person> findByName(String name) {

		return jdbcTemplate.query("select * from person where name =?", new Object[] { name },
				new BeanPropertyRowMapper<Person>(Person.class));

	}

	public int deleteByid(int id) {

		return jdbcTemplate.update("delete from person where id = ?", new Object[] { id });

	}

	public int deleteByName(String name) {

		return jdbcTemplate.update("delete from person where name = ?", new Object[] { name });

	}

	public int deleteByNameAndId(int id, String name) {

		return jdbcTemplate.update("delete from person where id = ? and name = ?", new Object[] { id, name });

	}

	public int insertUser(Person person) {

		return jdbcTemplate.update(
				"Insert into person (id, name, location, birth_date)" + "values(?,?,?,CURRENT_TIMESTAMP())",
				new Object[] { person.getId(), person.getName(), person.getLocation() });

	}
}