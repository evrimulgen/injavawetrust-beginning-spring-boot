/*
 * This file is generated by jOOQ.
*/
package demo.jooq.domain.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import demo.jooq.domain.Indexes;
import demo.jooq.domain.Keys;
import demo.jooq.domain.Public;
import demo.jooq.domain.tables.records.CommentsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comments extends TableImpl<CommentsRecord> {

    private static final long serialVersionUID = -1406475569;

    /**
     * The reference instance of <code>PUBLIC.COMMENTS</code>
     */
    public static final Comments COMMENTS = new Comments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentsRecord> getRecordType() {
        return CommentsRecord.class;
    }

    /**
     * The column <code>PUBLIC.COMMENTS.ID</code>.
     */
    public final TableField<CommentsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.COMMENTS.POST_ID</code>.
     */
    public final TableField<CommentsRecord, Integer> POST_ID = createField("POST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.COMMENTS.NAME</code>.
     */
    public final TableField<CommentsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.COMMENTS.EMAIL</code>.
     */
    public final TableField<CommentsRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.COMMENTS.CONTENT</code>.
     */
    public final TableField<CommentsRecord, String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>PUBLIC.COMMENTS.CREATED_ON</code>.
     */
    public final TableField<CommentsRecord, Timestamp> CREATED_ON = createField("CREATED_ON", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>PUBLIC.COMMENTS</code> table reference
     */
    public Comments() {
        this(DSL.name("COMMENTS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.COMMENTS</code> table reference
     */
    public Comments(String alias) {
        this(DSL.name(alias), COMMENTS);
    }

    /**
     * Create an aliased <code>PUBLIC.COMMENTS</code> table reference
     */
    public Comments(Name alias) {
        this(alias, COMMENTS);
    }

    private Comments(Name alias, Table<CommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comments(Name alias, Table<CommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_A, Indexes.PRIMARY_KEY_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentsRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentsRecord>>asList(Keys.CONSTRAINT_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CommentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CommentsRecord, ?>>asList(Keys.CONSTRAINT_AB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comments as(String alias) {
        return new Comments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comments as(Name alias) {
        return new Comments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(String name) {
        return new Comments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(Name name) {
        return new Comments(name, null);
    }
}
