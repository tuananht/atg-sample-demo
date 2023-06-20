import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_import-api-tests-from-postman'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/import-api-tests-from-postman/17413')

'step 2: Add visual checkpoint at Page_t_import-api-tests-from-postman'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00900_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
