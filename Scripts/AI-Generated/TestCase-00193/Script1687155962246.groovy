import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-gettext-from-ag-grid-table'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-gettext-from-ag-grid-table/40674')

'step 2: Add visual checkpoint at Page_t_unable-to-gettext-from-ag-grid-table'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00193_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
