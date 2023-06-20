import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_posibble-to-store-all-data-under-one-excel-23'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/posibble-to-store-all-data-under-one-excel-sheet/37934/23')

'step 2: Add visual checkpoint at Page_t_posibble-to-store-all-data-under-one-excel-23'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00741_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
