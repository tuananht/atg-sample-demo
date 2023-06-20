import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_xpath-not-working-in-katalon-but-works-in-chrome-dev-tools'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/xpath-not-working-in-katalon-but-works-in-chrome-dev-tools/36185')

'step 2: Add visual checkpoint at Page_t_xpath-not-working-in-katalon-but-works-in-chrome-dev-tools'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00814_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
