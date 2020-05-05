package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.entity.Album;
import com.atguigu.gmall.pms.mapper.AlbumMapper;
import com.atguigu.gmall.pms.service.AlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author Chenccy
 * @since 2020-04-29
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
