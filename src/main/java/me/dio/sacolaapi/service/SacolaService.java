package me.dio.sacolaapi.service;

import me.dio.sacolaapi.model.Item;
import me.dio.sacolaapi.model.Sacola;
import me.dio.sacolaapi.resources.dto.ItemDto;

public interface SacolaService {

    Item incluirItem(ItemDto itemDto);

    Sacola verSacola(Long id);

    Sacola fecharSacola(Long sacolaId, int formaPagamento);

}
