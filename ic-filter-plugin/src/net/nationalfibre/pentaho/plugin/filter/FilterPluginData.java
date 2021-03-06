package net.nationalfibre.pentaho.plugin.filter;

import net.nationalfibre.filter.Data;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Pentaho filter plugin data
 *
 * @author Fabio B. Silva <fabios@nationalfibre.net>
 */
public class FilterPluginData extends BaseStepData implements StepDataInterface
{
    /**
     * Data row
     */
    public RowMetaInterface outputRowMeta;

    /**
     * Data filter row
     */
    public Data filterData;

    /**
     * Hash filter index
     */
    public Integer hashFieldIndex = null;

    /**
     * Timestamp filter index
     */
    public Integer timeFieldIndex = null;

    /**
     * Hash field value
     */
    public String hashValue = null;

    /**
     * Timestamp field value
     */
    public Long timeValue = null;

    public FilterPluginData()
    {
        super();
    }
}
