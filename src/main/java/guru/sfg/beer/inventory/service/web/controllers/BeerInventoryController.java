package guru.sfg.beer.inventory.service.web.controllers;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by jt on 2019-05-31.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

    @GetMapping("inventory-failover")
    List<BeerInventoryDto> listBeersById(){
        OffsetDateTime now = OffsetDateTime.now();
        BeerInventoryDto beerInventoryDto = BeerInventoryDto.builder()
                .id(new UUID(0,0))
                .beerId(new UUID(0,0))
                .quantityOnHand(999)
                .createdDate(now)
                .lastModifiedDate(now)
                .build();
        return Collections.singletonList(beerInventoryDto);
    }
}
