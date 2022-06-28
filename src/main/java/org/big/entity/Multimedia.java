package org.big.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "multimedia", schema = "desc_trait_media", catalog = "")
public class Multimedia {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "sciname")
    private String sciname;
    @Column(name = "chname")
    private String chname;
    @Column(name = "rank")
    private String rank;
    @Column(name = "title")
    private String title;
    @Column(name = "showtype")
    private String showtype;
    @Column(name = "mediatype")
    private String mediatype;
    @Column(name = "medialabel")
    private String medialabel;
    @Column(name = "mediainfo")
    private String mediainfo;
    @Column(name = "country")
    private String country;
    @Column(name = "province")
    private String province;
    @Column(name = "city")
    private String city;
    @Column(name = "county")
    private String county;
    @Column(name = "locality")
    private String locality;
    @Column(name = "location")
    private String location;
    @Column(name = "lng")
    private Double lng;
    @Column(name = "lat")
    private Double lat;
    @Column(name = "path")
    private String path;
    @Column(name = "originurl")
    private String originurl;
    @Column(name = "copyright")
    private String copyright;
    @Column(name = "rightsholder")
    private String rightsholder;
    @Column(name = "announcer")
    private String announcer;
    @Column(name = "contributor")
    private String contributor;
    @Column(name = "sources_name")
    private String sourcesName;
    @Column(name = "license_id")
    private String licenseId;
    @Column(name = "license_name")
    private String licenseName;
    @Column(name = "sources_id")
    private String sourcesId;
    @Column(name = "description_id")
    private String descriptionId;
    @Column(name = "referencejson")
    private String referencejson;
    @Column(name = "taxon_id")
    private String taxonId;
    @Column(name = "dbase_id")
    private String dbaseId;
    @Column(name = "status")
    private Integer status;
    @Column(name = "synchdate")
    private Timestamp synchdate;
    @Column(name = "remark")
    private String remark;
}