package de.gravitex.springmvc.hero.api;

import de.gravitex.springmvc.hero.domain.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> findAllHeroes();

    Hero findHeroById(Long id);

    void save(Hero hero);
}
