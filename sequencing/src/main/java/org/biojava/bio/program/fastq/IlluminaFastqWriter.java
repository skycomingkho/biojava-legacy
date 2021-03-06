/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 */
package org.biojava.bio.program.fastq;

import java.io.IOException;

/**
 * Writer for {@link FastqVariant#FASTQ_ILLUMINA} formatted sequences.
 *
 * @since 1.7.1
 */
public final class IlluminaFastqWriter
    extends AbstractFastqWriter
{

    @Override
    protected Fastq convert(final Fastq fastq)
    {
        return fastq.convertTo(FastqVariant.FASTQ_ILLUMINA);
    }
}
