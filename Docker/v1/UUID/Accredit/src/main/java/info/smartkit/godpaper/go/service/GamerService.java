package info.smartkit.godpaper.go.service;

import info.smartkit.godpaper.go.dto.SgfDto;
import info.smartkit.godpaper.go.pojo.Gamer;
import info.smartkit.godpaper.go.pojo.User;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.io.IOException;
import java.util.List;

/**
 * Created by smartkit on 22/06/2017.
 */
public interface GamerService {
        List<Gamer> pairAll(List<User> tenantedUsers) throws MqttException;
        List<Gamer> playAll() throws MqttException;
        Gamer playOne(String gamerId) throws MqttException;
        SgfDto toSgf(Gamer gamer,Boolean filed) throws IOException;
}
