import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_retrieving-data-value-form-an-excel-file-by-a-specific-sheet-column-and-row'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/retrieving-data-value-form-an-excel-file-by-a-specific-sheet-column-and-row/81003')

'step 2: Add visual checkpoint at Page_t_retrieving-data-value-form-an-excel-file-by-a-specific-sheet-column-and-row'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00228_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
