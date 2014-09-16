package de.gravitex.springmvc.hero.service;

import com.google.common.collect.Lists;
import de.gravitex.springmvc.hero.api.HeroService;
import de.gravitex.springmvc.hero.domain.Hero;
import de.gravitex.springmvc.hero.domain.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultHeroService implements HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public DefaultHeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> findAllHeroes() {
        return Lists.newArrayList(heroRepository.findAll());
    }

    public Hero findHeroById(Long id) {
        return heroRepository.findOne(id);
    }

    public void save(Hero hero) {
        heroRepository.save(hero);
    }
}
