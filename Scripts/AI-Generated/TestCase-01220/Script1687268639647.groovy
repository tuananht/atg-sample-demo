import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-data-define-specific-excel-sheets-to-get-excel-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-data-define-specific-excel-sheets-to-get-excel-values/12290/4')

'step 2: Add visual checkpoint at Page_t_test-data-define-specific-excel-sheets-to-get-excel-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01220_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
