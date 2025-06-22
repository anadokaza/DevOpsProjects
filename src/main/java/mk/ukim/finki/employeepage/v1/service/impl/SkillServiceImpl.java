package mk.ukim.finki.employeepage.v1.service.impl;

import mk.ukim.finki.employeepage.v1.model.exceptions.InvalidSkillIdException;
import mk.ukim.finki.employeepage.v1.service.SkillService;
import mk.ukim.finki.employeepage.v1.model.Skill;
import mk.ukim.finki.employeepage.v1.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }


    @Override
    public Skill findById(Long id) {
        return skillRepository.findById(id).orElseThrow(InvalidSkillIdException:: new);
    }

    @Override
    public List<Skill> listAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill create(String name) {
        return skillRepository.save(new Skill(name));
    }
}
