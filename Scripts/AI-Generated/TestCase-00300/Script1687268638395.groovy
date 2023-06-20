import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_create-change-variables-from-test-script'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/create-change-variables-from-test-script/6246')

'step 2: Add visual checkpoint at Page_t_create-change-variables-from-test-script'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00300_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
