/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.org.debian.repository;

import gt.org.debian.gorgona.domain.BinaryPackage;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 *
 * @author aranax
 */
public interface BinaryPackageRepository extends GraphRepository<BinaryPackage> {
    BinaryPackage findById( Long id );
}
