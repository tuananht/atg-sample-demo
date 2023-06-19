import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_use-gradle-library-com-github-mkolisnyk-cucumber-reporting-into-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/use-gradle-library-com-github-mkolisnyk-cucumber-reporting-into-katalon/61953/5')

'step 2: Add visual checkpoint at Page_t_use-gradle-library-com-github-mkolisnyk-cucumber-reporting-into-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00291_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
