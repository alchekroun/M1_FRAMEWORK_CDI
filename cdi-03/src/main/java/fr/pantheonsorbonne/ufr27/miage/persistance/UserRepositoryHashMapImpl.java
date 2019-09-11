package fr.pantheonsorbonne.ufr27.miage.persistance;

import java.util.HashMap;
import java.util.Map;



import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.qualifier.InMemory;

@InMemory
public class UserRepositoryHashMapImpl implements UserRepository {
	Map<Long, User> map = new HashMap<>();

	@Override
	public void save(User t) {
		map.put(t.getId(), t);

	}

	@Override
	public User find(Long id) {
		return map.get(id);
	}

	
}