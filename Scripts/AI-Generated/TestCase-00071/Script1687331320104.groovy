import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unknown-error-devtoolsactiveport-file-doesnt-exist-the-process-started-from-chrome-location-usr-bin-google-chrome-is-no-longer-running-so-chromedriver-is-assuming-that-chrome-has-crashed'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unknown-error-devtoolsactiveport-file-doesnt-exist-the-process-started-from-chrome-location-usr-bin-google-chrome-is-no-longer-running-so-chromedriver-is-assuming-that-chrome-has-crashed/86665')

'step 2: Add visual checkpoint at Page_t_unknown-error-devtoolsactiveport-file-doesnt-exist-the-process-started-from-chrome-location-usr-bin-google-chrome-is-no-longer-running-so-chromedriver-is-assuming-that-chrome-has-crashed'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00071_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
